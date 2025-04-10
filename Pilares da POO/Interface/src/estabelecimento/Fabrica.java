package estabelecimento;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;


public class Fabrica {
  public public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();

    Scanner scanner = new Scanner();

    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
  }
}
