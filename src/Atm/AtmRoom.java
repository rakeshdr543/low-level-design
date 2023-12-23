package Atm;

public class AtmRoom {
    Atm atm;
    User user;

    public AtmRoom() {
       initialize();

       atm.getCurrentState().insertCard(atm, user.getCard());
         atm.getCurrentState().authenticatePin(atm, user.getCard(), "1234");
            atm.getCurrentState().selectOperation(atm, OperationType.WITHDRAWAL);
                atm.getCurrentState().withdraw(atm, user.getCard(), 2000);

                        System.out.println("Balance: " + user.getCard().getBankAccount().getBalance());
                        System.out.println("Balance: " + atm.getBalance());

    }

    private  void initialize() {
        createAtm();
        createUser();

    }

    private  void createAtm() {
        atm= Atm.getInstance();
        atm.setBalance(10000, 10, 10, 10);
    }

    private void createUser(){
        user = new User("Rakesh");
        user.setCard(createAtmCard());
    }

    private AtmCard createAtmCard(){
        AtmCard atmCard = new AtmCard("1234567890");
        BankAccount bankAccount = new BankAccount("1234567890", 3000);
        atmCard.setAccount(bankAccount);
        return atmCard;

    }
}
