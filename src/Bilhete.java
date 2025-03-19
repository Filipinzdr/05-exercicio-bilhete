import java.util.Random;

public class Bilhete {
    static final double tarifaBase = 5.20 ;
    double saldo;
    long numero;
    Usuario usuario;

    public Bilhete(Usuario usuario) {
        this.numero = gerarNumero();
        this.usuario = usuario;
    }

    private long gerarNumero() {
        Random rd = new Random();
        return rd.nextLong(1000, 10000);
    }

    public void carregarBilhete(double valor) {
        this.saldo += valor;

    }
    public double verSaldo(long numero){
        if(numero != this.numero) {
            return this.saldo;
        }
        else {
            System.out.println("numero invalido");

        }
        return 0;
    }

   public boolean passarCatraca(){
        double tarifa = tarifaBase/2;
        if (usuario.perfil.equalsIgnoreCase("comum")) {
            tarifa = tarifaBase;
        }
        if(saldo >= tarifa) {
            saldo -= tarifa;
            return true;
        }
        else {
            return false;
        }

   }

}
