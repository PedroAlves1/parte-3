
import javax.faces.bean.ManagedBean;
import br.com.model.hotel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
@ManagedBean (name="hotelController")
public class hotelController {
    private hotel hotel1 = new hotel();
    private hotel hotel2 = new hotel();
    private hotel hotelbarato = new hotel();
    private hotel hotelestrelas = new hotel();

    public String getNomeHotel1() {
        return hotel1.getNome();
    }

    public void setNomeHotel1(String nome) {
        hotel1.setNome(nome);
    }

    public float getPrecoHotel1() {
        return hotel1.getPreco();
    }

    public void setPrecoHotel1(float preco) {
        hotel1.setPreco(preco);
    }

    public int getEstrelasHotel1() {
        return hotel1.getEstrelas();
    }

    public void setEstrelasHotel1(int estrelas) {
        hotel1.setEstrelas(estrelas);
    }

    public String getDescricaoHotel1() {
        return hotel1.getDescricao();
    }

    public void setDescricaoHotel1(String descricao) {
        hotel1.setDescricao(descricao);
    }
        public String getNomeHotel2() {
        return hotel2.getNome();
    }

    public void setNomeHotel2(String nome) {
        hotel2.setNome(nome);
    }

    public float getPrecoHotel2() {
        return hotel2.getPreco();
    }

    public void setPrecoHotel2(float preco) {
        hotel2.setPreco(preco);
    }

    public int getEstrelasHotel2() {
        return hotel2.getEstrelas();
    }

    public void setEstrelasHotel2(int estrelas) {
        hotel2.setEstrelas(estrelas);
    }

    public String getDescricaoHotel2() {
        return hotel2.getDescricao();
    }

    public void setDescricaoHotel2(String descricao) {
        hotel2.setDescricao(descricao);
    }

    public hotel getHotelbarato() {
        return hotelbarato;
    }

    public void setHotelbarato(hotel hotelbarato) {
        this.hotelbarato = hotelbarato;
    }

    public hotel getHotelestrelas() {
        return hotelestrelas;
    }

    public void setHotelestrelas(hotel hotelestrelas) {
        this.hotelestrelas = hotelestrelas;
    }
    
   public String baratoAction(){
       if(hotel1.getPreco() < hotel2.getPreco()){
           hotelbarato=hotel1;
       }else{
           hotelbarato=hotel2;
       }
          
       return "";
   }
    public String estrelasAction(){
        if(hotel1.getEstrelas()>hotel2.getEstrelas()){
            hotelestrelas=hotel1;
        }else{
            hotelestrelas=hotel2;
        }
        return "";
    }
}

