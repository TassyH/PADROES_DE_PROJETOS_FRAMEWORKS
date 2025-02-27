package PRIMIERO_BIMESTRE.aula4.interfaces;

public class Principal {
    public static void main(String[] args) {
        Brasileiro bra = new Brasileiro();
        bra.dizOi();
        bra.dizTchau();
        bra.dizBomDia();
        Mexicano mex = new Mexicano();
        mex.dizOi();
        mex.dizBomDia();
        mex.dizTchau();
    }
}
