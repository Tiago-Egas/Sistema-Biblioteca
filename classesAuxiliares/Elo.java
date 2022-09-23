/**
 * 
 */
package classesAuxiliares;

/**
 * @author Kuruvar
 *
 */
public class Elo<TIPO>
{
    private TIPO valor;
    private Elo<TIPO> proximo;

    /**
     * @param string
     */
    public Elo(TIPO valorLista)
    {
        this.valor = valorLista;
    }

    public TIPO getValor()
    {
        return valor;
    }

    public void setValor(TIPO valorLista)
    {
        this.valor = valorLista;
    }

    public Elo<TIPO> getProximo()
    {
        return proximo;
    }

    public void setProximo(Elo<TIPO> valorLista)
    {
        this.proximo = valorLista;
    }
}