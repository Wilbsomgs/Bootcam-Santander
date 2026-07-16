package EstudosJava.Exercicios.Relogio;

public non-sealed class USClock extends Clock {
    private String periodIndicator;

    public void setHour(int hour) {
      setBeroreMidday();
      if((hour > 12) && (hour <=23)){
        setAfterMiddDay();
        this.hour = hour - 12;
      }else if (hour >= 24){
        this.hour = 0;
      }else {
        this.hour = hour;
      }
    }

    @Override
    Clock convert(final Clock clock){
       this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());

            default -> {
                System.out.println("Opção inválida");
            }
        }
        return this;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMiddDay(){
        this.periodIndicator = "PM";
    }

    public void setBeroreMidday(){
        this.periodIndicator = "PM";
    }
}
