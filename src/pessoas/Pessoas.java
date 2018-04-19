
package pessoas;

public class Pessoas 
{
    public static void main(String[] args) 
    {
        candidatos candidatoI = new candidatos();
        candidatoI.nome = "Jose";
        candidatoI.sexo = "M";
        candidatoI.idade = 30;
        candidatoI.escolaridade = "fundamental";
        candidatoI.dados();
        candidatoI.perfilcandidato();
        
        candidatos candidatoII = new candidatos();
        candidatoII.nome = "Maria";
        candidatoII.sexo = "F";
        candidatoII.idade = 45;
        candidatoII.escolaridade = "superior";
        candidatoII.dados();
        candidatoII.perfilcandidato();
        
    }
    
}
