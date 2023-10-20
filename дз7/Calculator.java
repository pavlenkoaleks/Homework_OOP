public class Calculator implements Addition,Multiplication,Division {
    public Calculator() {  
    }

    @Override
    public ComplexNumb addition(ComplexNumb numb1, ComplexNumb numb2){
        float a;
        float b;
        a = numb1.getRealPart()+numb2.getRealPart();
        b = numb1.getImaginaryPart()+numb2.getImaginaryPart();
        ComplexNumb result = new ComplexNumb(a, b);
        return result;
    };

    public ComplexNumb multiplication(ComplexNumb numb1, ComplexNumb numb2){
        float a;
        float b;
        a = (numb1.getRealPart()*numb2.getRealPart())-(numb1.getImaginaryPart()*numb2.getImaginaryPart());
        b = (numb1.getRealPart()*numb2.getImaginaryPart())+(numb1.getImaginaryPart()*numb2.getRealPart());
        ComplexNumb result = new ComplexNumb(a, b);
        return result;
    }
     public ComplexNumb division(ComplexNumb numb1, ComplexNumb numb2){
        float a;
        float b;
        a = ((numb1.getRealPart()*numb2.getRealPart())+(numb1.getImaginaryPart()*numb2.getImaginaryPart()))/
        (numb2.getRealPart()*numb2.getRealPart()+numb2.getImaginaryPart()*numb2.getImaginaryPart());
        b = ((numb1.getImaginaryPart()*numb2.getRealPart())-(numb1.getRealPart()*numb2.getImaginaryPart()))/
       (numb2.getRealPart()*numb2.getRealPart()+numb2.getImaginaryPart()*numb2.getImaginaryPart()) ;
        ComplexNumb result = new ComplexNumb(a, b);
        return result;
    }


}
