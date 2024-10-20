package AtividadesSemestre2.OrientaçãoObjeto.OrdemServiço;

public class OrdemServiço {
    private int id;
    private String nomeCliente;
    private String nomeProfissional;
    private Double valorServiçoHora;
    private Double valorKmDeslocamento;
    private Double nroHorasTrabalhadas;
    private Double nroKmPercorrido;
    private Double valorServiço;
    private Double valorDeslocamento;
    private Double valorPagar;

    public OrdemServiço(){

    }
    public OrdemServiço(int id, String nomeCliente, String nomeProfissional, Double valorServiçoHora, Double valorKmDeslocamento, Double nroHorasTrabalhadas, Double nroKmPercorrido, Double valorDeslocamento){
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.nomeProfissional = nomeProfissional;
        this.valorServiçoHora = valorServiçoHora;
        this.valorKmDeslocamento = valorKmDeslocamento;
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
        this.nroKmPercorrido = nroKmPercorrido;
        this.valorDeslocamento = valorDeslocamento;
    }
    public void status(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome Do Cliente: " + this.nomeCliente);
        System.out.println("Nome Profissional: " + this.nomeProfissional);
        System.out.println("Valor Serviço/Hora: " + this.valorServiçoHora);
        System.out.println("Valor do Km Percorrido: " + this.valorKmDeslocamento);
        System.out.println("Horas Trabalhadas: " + this.nroHorasTrabalhadas);
        System.out.println("Km Percorrido: " + this.nroKmPercorrido);
    }
    public void ValorPagar(){
        this.valorServiço = this.valorServiçoHora * this.nroHorasTrabalhadas;
        this.valorDeslocamento = this.valorKmDeslocamento * this.nroKmPercorrido;
        this.valorPagar = this.valorServiço + this.valorDeslocamento;

        System.out.println("Valor do Serviço: " + this.valorServiço);
        System.out.println("Valor do Deslocamento: " + this.valorDeslocamento);
        System.out.println("Valor a Pagar: " + this.valorPagar);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setNomeProfissional(String nomeProfissional){
        this.nomeProfissional = nomeProfissional;
    }
    public void setValorServiçoHora(Double valorServiçoHora){
        this.valorServiçoHora = valorServiçoHora;
    }
    public void setValorKmDeslocamento(Double valorKmDeslocamento){
        this.valorKmDeslocamento = valorKmDeslocamento;
    }
    public void setNrohorasTrabalhadas(Double nroHorasTrabalhadas){
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
    }
    public void setNroKmPercorrido(Double nroKmPercorrido){
        this.nroKmPercorrido = nroKmPercorrido;
    }
    public void setValorDeslocamento(Double valorDeslocamento){
        this.valorDeslocamento = valorDeslocamento;
    }
    public int getId(){
        return id;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getNomeProfissional(){
        return nomeProfissional;
    }
    public Double getValorServiçoHora(){
        return valorServiçoHora;
    }
    public Double getValorKmDeslocamento(){
        return valorKmDeslocamento;
    }
    public Double getNroHorasTrabalhadas(){
        return nroHorasTrabalhadas;
    }
    public Double getNroKmPercorrido(){
        return nroKmPercorrido;
    }
    public Double getValorDeslocamento(){
        return valorDeslocamento;
    }
    public Double getValorPagar(){
        return valorPagar;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
        result = prime * result + ((nomeProfissional == null) ? 0 : nomeProfissional.hashCode());
        result = prime * result + ((valorServiçoHora == null) ? 0 : valorServiçoHora.hashCode());
        result = prime * result + ((valorKmDeslocamento == null) ? 0 : valorKmDeslocamento.hashCode());
        result = prime * result + ((nroHorasTrabalhadas == null) ? 0 : nroHorasTrabalhadas.hashCode());
        result = prime * result + ((nroKmPercorrido == null) ? 0 : nroKmPercorrido.hashCode());
        result = prime * result + ((valorServiço == null) ? 0 : valorServiço.hashCode());
        result = prime * result + ((valorDeslocamento == null) ? 0 : valorDeslocamento.hashCode());
        result = prime * result + ((valorPagar == null) ? 0 : valorPagar.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrdemServiço other = (OrdemServiço) obj;
        if (id != other.id)
            return false;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (nomeProfissional == null) {
            if (other.nomeProfissional != null)
                return false;
        } else if (!nomeProfissional.equals(other.nomeProfissional))
            return false;
        if (valorServiçoHora == null) {
            if (other.valorServiçoHora != null)
                return false;
        } else if (!valorServiçoHora.equals(other.valorServiçoHora))
            return false;
        if (valorKmDeslocamento == null) {
            if (other.valorKmDeslocamento != null)
                return false;
        } else if (!valorKmDeslocamento.equals(other.valorKmDeslocamento))
            return false;
        if (nroHorasTrabalhadas == null) {
            if (other.nroHorasTrabalhadas != null)
                return false;
        } else if (!nroHorasTrabalhadas.equals(other.nroHorasTrabalhadas))
            return false;
        if (nroKmPercorrido == null) {
            if (other.nroKmPercorrido != null)
                return false;
        } else if (!nroKmPercorrido.equals(other.nroKmPercorrido))
            return false;
        if (valorServiço == null) {
            if (other.valorServiço != null)
                return false;
        } else if (!valorServiço.equals(other.valorServiço))
            return false;
        if (valorDeslocamento == null) {
            if (other.valorDeslocamento != null)
                return false;
        } else if (!valorDeslocamento.equals(other.valorDeslocamento))
            return false;
        if (valorPagar == null) {
            if (other.valorPagar != null)
                return false;
        } else if (!valorPagar.equals(other.valorPagar))
            return false;
        return true;
    }
    
}
