public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("----Operadores BiteWise----\n");
        System.out.println("------AND bitewise---------");

        var value1 = 9;
        var binaryValue1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binaryValue1);
        
        var value2 = 5; 
        var binaryValue2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binaryValue2);


        var result = value1 & value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("\n %s & %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);

        System.out.println("\n-----------------------------------");

        System.out.println("------OR bitewise---------");

        var value3 = 9;
        var binaryValue3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value3, binaryValue3);
        
        var value4 = 5; 
        var binaryValue4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value4, binaryValue4);


        var resultOr = value3 | value4;
        var binaryResultOr = Integer.toBinaryString(resultOr);
        System.out.printf("\n %s | %s = %s (representação binária %s)\n", value3, value4, resultOr, binaryResultOr);

        System.out.println("\n-----------------------------------");


        System.out.println("------SIDE LEFT SHIFT bitewise---------");
        // Descola bits à esquerda
        // Empura para esquerda e completa com 0

        var value5 = 9;
        var binaryValue5 = Integer.toBinaryString(value5);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value5, binaryValue5);
        
        var value6 = 2; 
        var binaryValue6 = Integer.toBinaryString(value6);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value6, binaryValue6);


        var resultSideLeftShift = value5 << value6;
        var binaryResultSideLeftShift = Integer.toBinaryString(resultSideLeftShift);
        System.out.printf("\n %s << %s = %s (representação binária %s)\n", value5, value6, resultSideLeftShift, binaryResultSideLeftShift);

        System.out.println("\n-----------------------------------");

        System.out.println("------SIDE LEFT SHIFT bitewise---------");
        // Descola bits à direita
        // Empura para direita e verifica se o número é negativo para completar com 0 ou 1 

        var value7 = 9;
        var binaryValue7 = Integer.toBinaryString(value7);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value7, binaryValue7);
        
        var value8 = 2; 
        var binaryValue8 = Integer.toBinaryString(value8);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value6, binaryValue8);


        var resultSideRightShift = value7 << value6;
        var binaryResultSideRightShift = Integer.toBinaryString(resultSideRightShift);
        System.out.printf("\n %s << %s = %s (representação binária %s)\n", value7, value6, resultSideRightShift, binaryResultSideRightShift);

        System.out.println("\n-----------------------------------");
    }
}
