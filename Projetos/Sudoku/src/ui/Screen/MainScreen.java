package ui.Screen;

import Model.Space;
import Service.BoardSevice;
import Service.EventEnum;
import Service.NotifierService;
import ui.Button.CheckGameStatusButton;
import ui.Button.FinishGameButton;
import ui.Button.ResetButton;
import ui.Frame.MainFrame;
import ui.Input.NumberText;
import ui.Panel.MainPanel;
import ui.Panel.SudokuSector;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MainScreen {

    private final static Dimension dimension = new Dimension(600, 600);

    private final BoardSevice boardSevice;

    private final NotifierService notifierService;

    private JButton checkGameStatusButton;
    private JButton finishGameButton;
    private JButton resetButton;

    public MainScreen(final Map<String, String> gameConfig){
        this.boardSevice = new BoardSevice(gameConfig);
        this.notifierService = new NotifierService();
    }

    public void buildMainScreen(){
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        for (int r = 0; r < 9; r+=3){
            var endRow = r + 2;
            for (int c = 0; c < 9; c+=3){
                var endCol = c + 2;
                var spaces = getSpacesFromSector(boardSevice.getSpace(), c, endCol, r, endRow);
                JPanel sector = generateSection(spaces);
                mainPanel.add(sector);
            }
        }
        addResetButton(mainPanel);
        addCheckGameStatusButton(mainPanel);
        addFinishGameButton(mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private List<Space> getSpacesFromSector(List<List<Space>> spaces,
                                            final int initCol, final int endCol,
                                            final int initRow, final int endRow){
        List<Space> spaceSector = new ArrayList<>();
        for(int r = initRow; r <= endRow; r++){
            for(int c = initCol; c <= endCol; c++){
                spaceSector.add(spaces.get(c).get(r));
            }
        }
        return spaceSector;
    }

    private JPanel generateSection(final List<Space> spaces){
        List<NumberText> fields = new ArrayList<>(spaces.stream().map(NumberText::new).toList());
        fields.forEach(t -> notifierService.subscribe(EventEnum.CLEAR_SPACE, t));
        return new SudokuSector(fields);
    }

    private void addFinishGameButton(final JPanel mainPanel) {
        finishGameButton = new FinishGameButton(e ->{
            if(boardSevice.gameIsFinished()){
                JOptionPane.showMessageDialog(null, "Parabéns, você concluiu o jogo");
                resetButton.setEnabled(false);
                checkGameStatusButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Seu jogo tem alguma inconsistência, ajuste e tente novamente");
            }
        });
        mainPanel.add(finishGameButton);
    }

    private void addCheckGameStatusButton(final JPanel mainPanel) {
        checkGameStatusButton = new CheckGameStatusButton(e ->{
            var hasErrors = boardSevice.hasErrors();
            var gameStatus = boardSevice.getStatus();
            var message = switch (gameStatus){
                case NON_STARTED -> "O jogo não foi iniciado";
                case INCOMPLETE -> "O jogo está incompleto";
                case COMPLETE -> "O jogo está completo";
            };
            message += hasErrors ? " e contém erros" : " e não contém erros";
            JOptionPane.showMessageDialog(null, message);
        });
        mainPanel.add(MainScreen.this.checkGameStatusButton);
    }

    private void addResetButton(final JPanel mainPanel) {
        resetButton = new ResetButton(e ->{
           var dialogResult = JOptionPane.showConfirmDialog(
                   null,
                   "Deseja realmente reiniciar o jogo?",
                   "Limpar o jogo",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE
           );
           if(dialogResult == 0){   //0 é igual a sim, 1 é igual a não
               boardSevice.reset();
               notifierService.notify(EventEnum.CLEAR_SPACE);
           }
        });
        mainPanel.add(resetButton);
    }
}
