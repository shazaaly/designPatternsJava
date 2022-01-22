package strategyEx2;

public abstract class PhoneCameraApp {
	SharingBehavior shareBehavior;
	
	public void performSharing() {
		shareBehavior.share();
		
	}
	
	 abstract void save();
	 abstract void edit();
	 abstract void take();

}
