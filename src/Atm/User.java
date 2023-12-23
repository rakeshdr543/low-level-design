package Atm;

public class User {
     String name;
     AtmCard card;
     BankAccount account;

        public User(String name) {
            this.name = name;
        }

        public void setCard(AtmCard card) {
            this.card = card;
        }

        public AtmCard getCard() {
            return card;
        }




}
