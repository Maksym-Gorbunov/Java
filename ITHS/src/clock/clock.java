package clock;

public class clock {
	private int hours;
	private int minutes;
	private int seconds;
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours>=0 && hours<=23) {
			this.hours = hours;
		} else {
			this.hours = hours % 24;
		}
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes>=0 && minutes<=59) {
			this.minutes = minutes;
		} else {
			this.minutes = minutes % 60;
			setHours(this.hours + (minutes / 60));
		}
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		if(seconds>=0 && seconds<=59) {
			this.seconds = seconds;
		} else {
			this.seconds = seconds % 60;
			setMinutes(this.minutes + (seconds / 60));
		}
	}
	public void printTime() {
		System.out.println("("+hours+":"+minutes+":"+seconds+")");
	}
	public void setTime(int h, int m, int s) {
		setHours(h);
		setMinutes(m);
		setSeconds(s);
	}
	public void tick() {
		setSeconds(seconds + 1);
	}
}
