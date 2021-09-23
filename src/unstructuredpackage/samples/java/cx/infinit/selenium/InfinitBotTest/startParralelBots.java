package cx.infinit.selenium.InfinitBotTest;

public class startParralelBots {
	private static Thread[] handlers;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		handlers = new Thread[3];

		for (int i = 0; i < handlers.length; i++) {
			handlers[i] = new Thread() {
				public void run() {
					new BotTest1().main(new String[] { " " });
				}
			};
		}

		for (Thread handler : handlers) {
			handler.start();
		}
	}

}
