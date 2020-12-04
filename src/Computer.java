class Computer{

    public String choose(){
        int random;

        random = (int)(0 + Math.random() * 3);
        String[] computer = {"rock", "paper", "scissors"};

        String shape = computer[random];

        System.out.println("Computer -> " + shape);
        return shape;
    }

}