public class Paginator {

    private static int SMS_LENGTH;

    public Paginator(int SMS_LENGTH) {
        SMS_LENGTH=SMS_LENGTH;
    }

    public String[] paginate(String text){

        SMS_LENGTH = 10;
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

    }

}
