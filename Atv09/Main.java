package Atv09;

import java.util.ArrayList;

public class Main {
	
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Joao", 60000, 25));
        funcionarios.add(new Funcionario("Maria", 48000, 28));
        funcionarios.add(new Funcionario("Pedro", 52000, 32));
        funcionarios.add(new Funcionario("Ana", 55000, 22));
        funcionarios.add(new Funcionario("Carlos", 45000, 29));

        
        System.out.println("Funcionários que ganham mais de R$50.000 por ano e têm menos de 30 anos:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.salarioAnual > 50000 && funcionario.idade < 30) {
                System.out.println(funcionario.nome);
            }
        }
    }

}
