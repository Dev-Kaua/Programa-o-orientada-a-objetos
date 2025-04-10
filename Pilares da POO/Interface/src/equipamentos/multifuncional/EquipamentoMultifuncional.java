package equipamentos.multifuncional;
//public class EquipamentoMultifuncional extends Impressora extends Copiadora extends Digitalizadora {}
//Java não permite isso, isso é herança multipla
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
  public void copiar() {
    System.out.println("Copiando via equip multifuncional");
  }
  public void digitalizar() {
    System.out.println("Digitalizando via equip multifuncional");
  }
  public void imprimir() {
    System.out.println("Imprimindo via equip multifuncional");
  }
}