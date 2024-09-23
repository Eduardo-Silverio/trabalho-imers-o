import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<funcionario> funcionarios = new ArrayList<>();
        List<departamento> departamentos = new ArrayList<>();

        funcionarios.add(new funcionario(1, "João", 140000, "engenheiro", 101));
        funcionarios.add(new funcionario(2, "Maria", 155000, "gerente", 102));
        funcionarios.add(new funcionario(3, "Paulo", 120000, "analista", 101));
        funcionarios.add(new funcionario(4, "Leticia", 160000, "diretor", 103));

        departamentos.add(new departamento(101, "Vendas", 1000000));
        departamentos.add(new departamento(102, "Marketing", 1000000));
        departamentos.add(new departamento(103, "TI", 500000));
    }
}