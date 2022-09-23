/**
 * 
 */
package classesAuxiliares;

/**
 * @author Kuruvar
 *
 */
public class IteratorLista<TIPO>
{
    private Elo<TIPO> elo;

    public IteratorLista(Elo<TIPO> atual)
    {
        this.elo = atual;
    }

    public boolean temProximo()
    {
        if (elo.getProximo() == null)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public Elo<TIPO> getProximo()
    {
        this.elo = elo.getProximo();
        return elo;
    }
}
