package QA27_8_2_Khramtsova;

class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("", "");
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер телефона: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
