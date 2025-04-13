public non-sealed class USClock extends Clock {

  private String periodIndicator;
  public String getPeriodIndicator() {
    return periodIndicator;
  }

  public void afterMidDay() {
    this.periodIndicator = "PM";
  }
  public void beforeMidDay() {
    this.periodIndicator = "AM";
  }
  
  
  public void setHour(int hour){
    if ((hour > 12) && (hour <= 23)){
      this.periodIndicator = "PM";
      this.hour = hour - 12;
    }else if(hour >=24){
      this.hour = 0;
    } else {
      this.hour = hour;
    }
  }
  @Override
  Clock convert(final Clock clock){
    this.second = getSecond();
    this.minute = getMinute();
    switch (clock){
      case USClock usClock -> {
        this.hour = usClock.getHour();
        this.periodIndicator = usClock.getPeriodIndicator();
      }
      case BRLClock brlClock -> this.setHour(brlClock.getHour());
      
    }
    return this;
  }
  @Override
  public String getTime() {
    return super.getTime() + " " + this.periodIndicator;
  }
}
