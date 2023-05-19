class QTUtility {

    public void createSomeOutput(int x) {
        System.out.println(x);
        switch(x) {
            case x==0:
                System.out.println("This is zero.");
            case x==1:
                System.out.println("This is one.");
            case x==2:
                System.out.println("This is two.");
            case x==3:
                System.out.println("This is three.");
            case x==4:
                System.out.println("This is four.");
            default:
                System.out.println("This is %s.", x);
        }
    }
}
