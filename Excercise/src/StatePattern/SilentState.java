package StatePattern;

public class SilentState implements PhoneState
{
  @Override public void onReceiveCall(Phone phone)
  {
    phone.lightUpScreen();
  }

  @Override public void onVolumeButtonDown(Phone phone)
  {

  }

  @Override public void onVolumeButtonUp(Phone phone)
  {
    phone.turnVolumeUp();
phone.setState(new SoundState());

  }

  @Override public void onReceiveTextMessage(String txt, Phone phone)
  {
phone.lightUpScreen();
    System.out.println(txt);
  }
}
