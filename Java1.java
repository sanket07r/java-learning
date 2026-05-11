class Java1{
    public static void main(String[]args)
    {
        String str=new String(" Harry ");

        System.out.println("last index :"+ str.lastIndexOf("r",3));


        System.out.println("lowercase :"+str.toLowerCase());

        System.out.println("replace :"+str.replace("","_"));
        
        String text="To Lower   Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        String letter="Dear <|name|>,thanks a lot";
        letter = letter.replace("<|name|>", "sanket");
        System.out.println(letter);
        
        // detecting spaces
        String myString="This string contains double and triple spcaces";
    System.out.println(myString.indexOf("  "));

    String letterb=" Dear sanket you are good boy";
        char[] chars = letterb.toCharArray();

        for(char c : chars){
        System.out.print(c+" ");
        }
    
}
}