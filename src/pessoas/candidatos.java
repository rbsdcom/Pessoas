package pessoas;

public class candidatos 
{
    String nome;
    String escolaridade;
    String sexo;
    String cargo;
    int idade;

    void dados() 
    {
        System.out.println("Nome : " + this.nome);
        System.out.println("Sexo : " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Escolaridade: " + this.escolaridade);
    }

    void perfilcandidato() 
    {
        if (sexo == "M" && idade > 40 && escolaridade == "fundamental") {
            System.out.println(cargo = "Servente \n");
        } else if (sexo == "F" && idade < 25 && escolaridade == "medio") {
            System.out.println(cargo = "Recepcionista");
        } else if ((sexo == "F" || sexo == "M") && idade > 30 && escolaridade == "superior") {
            System.out.println(cargo = "Auxiliar de RH \n");
        } else {
            System.out.println("Nenhuma profissao se encaixa no seu perfil \n");
        }
    }
}
