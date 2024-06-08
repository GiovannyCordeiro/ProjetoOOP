public class Ofertadedescontos extends RegistrarVendas{
    
    public void desconto10() {
        if (valorTotal >= 200 && valorTotal < 500){
            valorTotal = valorTotal - ((10/100) * valorTotal);
        }
        else{
            System.out.println("Desconto aplicado não disponível");
        }
        
    }

    public void desconto20() {
        if (valorTotal >= 500 && valorTotal < 1000){
            valorTotal = valorTotal -  ((10/100) * valorTotal);
        }
        else{
            System.out.println("Desconto aplicado não disponível");
        }
        
    }

    public void desconto30() {
        if (valorTotal >= 1000){
            valorTotal = valorTotal -  ((10/100) * valorTotal);
        }
        else{
            System.out.println("Desconto aplicado não disponível");
        }
        
    }

}


