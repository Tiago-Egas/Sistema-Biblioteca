/**
 * 
 */
package classesPrincipais;

/**
 * @author Kuruvar
 *
 */
public class Usuario
{
    private int cdUsuario;
    private String nomeUsr;
    private String cidade;
    private String uf;
    private int cep;
    private long foneUsr;

    public Usuario(int cdUsuario, String nomeUsr, String cidade, String uf,
            int cep, long foneUsr)
    {
        this.cdUsuario = cdUsuario;
        this.nomeUsr = nomeUsr;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.foneUsr = foneUsr;
    }

    @Override
    public String toString()
    {
        return "Registro: " + this.cdUsuario + ", " + "Nome: " + this.nomeUsr
                + "\n" + "Cidade: " + this.cidade + "\n" + "UF: " + this.uf
                + "\n" + "CEP: " + this.cep + "\n" + "Contato: " + this.foneUsr
                + "\n";
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
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

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getUf()
    {
        return uf;
    }

    public void setUf(String uf)
    {
        this.uf = uf;
    }

    public int getCep()
    {
        return cep;
    }

    public void setCep(int cep)
    {
        this.cep = cep;
    }

    public long getfoneUsr()
    {
        return foneUsr;
    }

    public void setFone(long foneUsr)
    {
        this.foneUsr = foneUsr;
    }
}