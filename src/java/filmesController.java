import br.com.model.filmes;
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
@ManagedBean (name="filmeController")
public class filmesController {
    private filmes filme1 = new filmes();
    private filmes filme2 = new filmes();
    private filmes mFilme = new filmes();
    
    public int getOscarFilme1() {
        return filme1.getOscar();
    }

    public void setOscarFilme1(int oscar) {
        filme1.setOscar(oscar);
    }

    public int getEstrelasFilme1() {
        return filme1.getEstrelas();
    }

    public void setEstrelasFilme1(int estrelas) {
        filme1.setEstrelas(estrelas);
    }

    public String getNomeFilme1() {
        return filme1.getNome();
    }

    public void setNomeFilme1(String nome) {
        filme1.setNome(nome);
    }    
        
    public int getOscarFilme2() {
        return filme2.getOscar();
    }

    public void setOscarFilme2(int oscar) {
        filme2.setOscar(oscar);
    }

    public int getEstrelasFilme2() {
        return filme2.getEstrelas();
    }

    public void setEstrelasFilme2(int estrelas) {
        filme2.setEstrelas(estrelas);
    }

    public String getNomeFilme2() {
        return filme2.getNome();
    }

    public void setNomeFilme2(String nome) {
        filme2.setNome(nome);
    }
    public String mAction() {
        if (filme1.getEstrelas() > filme2.getEstrelas()) {
            mFilme = filme1;
        }
        else {
            mFilme = filme2;
        }
        return "";
    }
    

    public filmes getmFilme() {
        return mFilme;
    }

    public void setmFilme(filmes mFilme) {
        this.mFilme = mFilme;
    }



}
