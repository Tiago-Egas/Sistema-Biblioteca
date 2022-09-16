/**
 * 
 */
package classesAuxiliares;

/**
 * @author Kuruvar
 *
 */
public class Lista<TIPO>
{
    private Elo<TIPO> primeiro;
    private Elo<TIPO> ultimo;
    private int tamanho;

    public Lista()
    {
        this.tamanho = 0;
    }

    public Elo<TIPO> getPrimeiro()
    {
        return primeiro;
    }

    public void setPrimeiro(Elo<TIPO> primeiro)
    {
        this.primeiro = primeiro;
    }

    public Elo<TIPO> getUltimo()
    {
        return ultimo;
    }

    public void setUltimo(Elo<TIPO> ultimo)
    {
        this.ultimo = ultimo;
    }

    public int getTamanho()
    {
        return tamanho;
    }

    public void setTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }

    public void addElo(TIPO valorLista)
    {
        Elo<TIPO> newElo = new Elo<TIPO>(valorLista);
        if (this.primeiro == null && this.ultimo == null)
        {
            this.primeiro = newElo;
            this.ultimo = newElo;
        } else
        {
            this.ultimo.setProximo(newElo);
            this.ultimo = newElo;
        }
        this.tamanho++;
    }

    public void remElo(TIPO valorLista)
    {
        Elo<TIPO> anterior = null;
        Elo<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++)
        {
            if (atual.getValor().equals(valorLista))
            {
                if (this.tamanho == 1)
                {
                    this.ultimo = null;
                } else if (atual == primeiro)
                {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo)
                {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else
                {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elo<TIPO> get(int posicao)
    {
        Elo<TIPO> atual = this.primeiro;

        for (int i = 0; i < posicao; i++)
        {
            if (atual.getProximo() != null)
            {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteratorLista<TIPO> getIterator()
    {
        return new IteratorLista<TIPO>(this.primeiro);
    }
}