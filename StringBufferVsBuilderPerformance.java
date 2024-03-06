public class StringBufferVsBuilderPerformance {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        long bufferStarted = System.currentTimeMillis();
        for (int i=0; i<10000000; i++){
            stringBuffer.append("Buffer");
        }
        System.out.println("Time taken by string buffer: " +(System.currentTimeMillis()-bufferStarted)+ "ms. ");

        StringBuilder stringBuilder = new StringBuilder();
        long builderStarted = System.currentTimeMillis();
        for (int i=0; i<10000000; i++){
            stringBuilder.append("Buffer");

        }
        System.out.println("Time taken by string builder: " +(System.currentTimeMillis()-builderStarted)+ "ms. ");

    }
}
