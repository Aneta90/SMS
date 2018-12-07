public class Paginator {

    private static int SMS_LENGTH;

    public Paginator(int SMS_LENGTH) {
        SMS_LENGTH=SMS_LENGTH;
    }

    public String[] paginate(String text){

        int SMS_LENGTH = 10;
        int arraySize = (int) Math.ceil((double) text.length() / SMS_LENGTH);
        String[] returnArray = new String[arraySize];
        int index = 0;
        for(int i = 0; i < text.length(); i = i+SMS_LENGTH)
        {
            if(text.length() - i < SMS_LENGTH)
            {
                returnArray[index++] = text.substring(i);
            }
            else
            {
                returnArray[index++] = text.substring(i, i+SMS_LENGTH);
            }
        }
        return returnArray;
        /*final AtomicInteger atomicInteger = new AtomicInteger(0);
        String[]result = text.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> atomicInteger.getAndIncrement() / SMS_LENGTH
                        , Collectors.joining()))
                .values().toArray(new String[0]);
        return result;*/

    }

}
