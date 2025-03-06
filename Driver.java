package driver;

import store.*;


public class Driver {

	public static void main(String[] args) {
		AbsProduct[] product = makeProductList();
		Deliverable[] deliverables = getDeliverable(product);
		System.out.println("---商品リスト---");
		displayProductList(product);
		System.out.println();
		System.out.println("---配送可能商品---");
		displayDelivList(deliverables);
	}


	static AbsProduct[] makeProductList(){

		AbsProduct[] product = {
						new LimitedAbsProduct("マウス", 2000, 10),
						new SpecialAbsProduct("特価キーボード", 3600, 4500),
						new LimitedAbsProduct("Webカメラ", 3900, 7),
						new NormalAbsProduct("マイク",2800),
						new SpecialAbsProduct("ディスプレイ",15000,20000),
						new NormalAbsProduct("LED照明",4200)
		};
		return product;
	}


	public static void displayProductList(AbsProduct[] product){
		for (int i = 0; i < product.length; i++){
				product[i].display();
		}
	}

	public static Deliverable[] getDeliverable(AbsProduct[] product){
		Deliverable[] deliverable = new Deliverable[product.length];
		int cnt = 0;
		for (int i = 0; i < product.length; i++){
			if(product[i] instanceof Deliverable){
				deliverable[cnt] = (Deliverable) product[i];
				cnt++;
			}
		}
		return deliverable ;
	}

	public static void displayDelivList(Deliverable[] deliverable){
		for(int i = 0; i < deliverable.length;i++){
			if (deliverable[i] == null){

			}
			else {
				deliverable[i].displayDeliv();
			}
		}

	}


}
