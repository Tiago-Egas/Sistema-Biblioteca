/**
 * 
 */
package classesPrincipais;

/**
 * @author Kuruvar
 *
 */
public class Emprestimo
{
    private int cdEmprestimo;
    private int cdUsuario;
    private String nomeUsr;
    private long foneUsr;
    private String dtRetirada;
    private String dtDevolucao;

    public Emprestimo(int cdEmprestimo, int cdUsuario, String nomeUsr,
            long foneUsr, String dtRetirada, String dtDevolucao)
    {
        this.cdEmprestimo = cdEmprestimo;
        this.cdUsuario = cdUsuario;
        this.nomeUsr = nomeUsr;
        this.foneUsr = foneUsr;
        this.dtRetirada = dtRetirada;
        this.dtDevolucao = dtDevolucao;
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public String toString()
    {
        return "Registro: " + cdEmprestimo + "\n" + "Usuário: " + cdUsuario
                + ", " + "Nome: " + nomeUsr + "\n" + "Contato: " + foneUsr
                + "\n" + "Retirada em: " + dtRetirada + "\n" + "Devolvido em: "
                + dtDevolucao + "\n";
    }

    public int getCdEmprestimo()
    {
        return cdEmprestimo;
    }

    public void setCdEmprestimo(int cdEmprestimo)
    {
        this.cdEmprestimo = cdEmprestimo;
    }

    public int getCdUsuario()
    {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario)
    {
        this.cdUsuario = cdUsuario;
    }

    public String getNomeUsr()
    {
        return nomeUsr;
    }

    public void setNomeUsr(String nomeUsr)
    {
        this.nomeUsr = nomeUsr;
    }

    public long getFoneUsr()
    {
        return foneUsr;
    }

    public void setFoneUsr(long foneUsr)
    {
        this.foneUsr = foneUsr;
    }

    public String getDtRetirada()
    {
        return dtRetirada;
    }

    public void setDtRetirada(String dtRetirada)
    {
        this.dtRetirada = dtRetirada;
    }

    public String getDtDevolucao()
    {
        return dtDevolucao;
    }

    public void setDtDevolucao(String dtDevolucao)
    {
        this.dtDevolucao = dtDevolucao;
    }

}
