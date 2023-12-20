package Refeição.ufpb.br;

public class RefeicaoRealizada {
    private String matriculaAluno;
    private String tipoRefeicao;
    public RefeicaoRealizada(String matriculaAluno, String tipoRefeicao) {
        this.matriculaAluno = matriculaAluno;
        this.tipoRefeicao = tipoRefeicao;
    }
    public String getMatriculaAluno() {
        return matriculaAluno;
    }
    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    public String getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(String tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }
    @Override
    public String toString() {
        return "Refeição Realizada pelo aluno de matrícula " + this.matriculaAluno +

                ", tipo da refeição: "

                + this.tipoRefeicao;

    }
}
