
import br.com.model.carro;
import javax.faces.bean.ManagedBean;

@ManagedBean (name="carroController")
public class carroController {
    private carro carro1 = new carro();
    private carro carro2 = new carro();
    private carro ipvacarro = new carro();

    
    public String getModelo1() {
        return carro1.getModelo();
    }

    public void setModelo1(String modelo) {
        carro1.setModelo(modelo);
    }

    public Integer getAno1() {
        return carro1.getAno();
    }

    public void setAno1(Integer ano) {
        carro1.setAno(ano);
    }

    public Float getPreco1() {
        return carro1.getPreco();
    }

    public void setPreco1(Float preco) {
        carro1.setPreco(preco);
    }

    public Float getConsumo1() {
    return carro1.getConsumo();
        }

    public void setConsumo1(Float consumo) {
        carro1.setConsumo(consumo);
    }

    public String getTipo1() {
        return carro1.getTipo();
    }

    public void setTipo1(String tipo) {
        carro1.setTipo(tipo);
    }

    public String getDescricao1() {
        return carro1.getDescricao();
    }

    public void setDescricao1(String descricao) {
        carro1.setDescricao(descricao);
    }
    public String getModelo2() {
        return carro2.getModelo();
    }

    public void setModelo2(String modelo) {
        carro2.setModelo(modelo);
    }

    public Integer getAno2() {
        return carro2.getAno();
    }

    public void setAno2(Integer ano) {
        carro2.setAno(ano);
    }

    public Float getPreco2() {
        return carro2.getPreco();
    }

    public void setPreco2(Float preco) {
        carro2.setPreco(preco);
    }

    public Float getConsumo2() {
    return carro2.getConsumo();
        }

    public void setConsumo2(Float consumo) {
        carro2.setConsumo(consumo);
    }

    public String getTipo2() {
        return carro2.getTipo();
    }

    public void setTipo2(String tipo) {
        carro2.setTipo(tipo);
    }

    public String getDescricao2() {
        return carro2.getDescricao();
    }

    public void setDescricao2(String descricao) {
        carro2.setDescricao(descricao);
    }
    
    public String confirmaAction(){
          
        if (carro2.getIpva() > carro1.getIpva()) {
            ipvacarro = carro1;
        }
        else {
            ipvacarro = carro2;
        }
        return "";
    }

    public carro getIpvacarro() {
        return ipvacarro;
    }

    public void setIpvacarro(carro ipvacarro) {
        this.ipvacarro = ipvacarro;
    }


}