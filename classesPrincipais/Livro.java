/**
 * 
 */
package classesPrincipais;

/**
 * @author Kuruvar
 *
 */
public class Livro
{
    private int cdLivro;
    private String titulo;
    private int anoLivro;
    private int edicao;
    private String editora;

    public Livro(int cdLivro, String titulo, int anoLivro, int edicao,
            String editora)
    {
        this.cdLivro = cdLivro;
        this.titulo = titulo;
        this.anoLivro = anoLivro;
        this.edicao = edicao;
        this.editora = editora;
    }

    @Override
    public String toString()
    {
        return "Registro: " + this.cdLivro + "\n" + "Título: " + this.titulo
                + "\n" + "Ano: " + this.anoLivro + "\n" + "Edição: "
                + this.edicao + "\n" + "Editora: " + this.editora + "\n";
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int getCdLivro()
    {
        return cdLivro;
    }

    public void setCdLivro(int cdLivro)
    {
        this.cdLivro = cdLivro;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAnoLivro()
    {
        return anoLivro;
    }

    public void setAnoLivro(int anoLivro)
    {
        this.anoLivro = anoLivro;
    }

    public int getEdicao()
    {
        return edicao;
    }

    public void setEdicao(int edicao)
    {
        this.edicao = edicao;
    }

    public String getEditora()
    {
        return editora;
    }

    public void setEditora(String editora)
    {
        this.editora = editora;
    }
}
