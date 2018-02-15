package com.caglartelef.behavioral.state;

public class Adam {

	private Mod mod;

	public void sayHello() {
		if (mod instanceof UzgunMod) {
			System.out.println("naber ");
		}
		if (mod instanceof MutluMod) {
			System.out.println("heeyyy naber ? nasilsin ? hersey yolunda mi ? ");
		}
	}

	public void sayGoodBye() {
		// instance of kullanmay�n
		// kulland�rmay�n
		// kullananlarla konu�may�n
		if (mod instanceof UzgunMod) {
			System.out.println("baaay ");
		}
		if (mod instanceof MutluMod) {
			System.out.println("Gorusuruz kendine iyi bak....");
		}
	}

	public void mutluOl() {

		this.mod = (MutluMod) this.mod;

	}

	public void mutsuzOl() {
		this.mod = new UzgunMod();

	}

}
