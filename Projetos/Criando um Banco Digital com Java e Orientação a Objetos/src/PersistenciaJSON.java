import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class PersistenciaJSON {

    private static final RuntimeTypeAdapterFactory<Conta> contaAdapterFactory = RuntimeTypeAdapterFactory
            .of(Conta.class, "tipoConta")
            .registerSubtype(ContaCorrente.class, "corrente")
            .registerSubtype(ContaPoupanca.class, "poupanca");

    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapterFactory(contaAdapterFactory)
            .create();

    public static void salvarContas(List<Conta> contas, String caminhoArquivo) {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            gson.toJson(contas, writer);
            System.out.println("Contas salvas com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar contas: " + e.getMessage());
        }
    }

    public static List<Conta> carregarContas(String caminhoArquivo) {
        try (FileReader reader = new FileReader(caminhoArquivo)) {
            Type tipoLista = new TypeToken<List<Conta>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.out.println("Erro ao carregar contas: " + e.getMessage());
            return null;
        }
    }
}
