//Deal
//* Необходимо реализовать программу, которая будет позволять вводить сделки
// * купли-продажи товаров между двумя участниками. В каждой сделке может быть
// * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
// * каждого товара рассчитывается из его стоимости и количества. Программа должна
// * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
// * экран. Ввод информацию осуществляется с экрана (консоли). Количество
// * дополнительной информацию о сделке, участнике, товаре придумать самому
// * (больше одного поля для класса).package by.academy.homework3;
package by.academy.homework3;

import java.time.LocalDateTime;

public class Deal {
	private Person seller;
	private Person buyer;
	private LocalDateTime deadlineDate;
	private Product[] products;

	public Deal(Person seller, Person buyer, Product[] products) {
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Product[] getProducts() {
		return products;
	}

//		7. Добавить в объект Deal поле deadline date, которую будет вводиться автоматически. (сегодня + 10 дней):
	public void DeadlineDate() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(deadlineDate = now.plusDays(10)); // добавление 10 дней к сегодня
	}

	public double calcFullPrice() {
		double summ = 0;

		for (Product p : products) {
			summ += p.calcPrice();
		}
		return summ;
	}

	public double calcFullPriceWithDiscount() {
		double summ = 0;

		for (Product p : products) {
			summ += p.calcPrice() * p.discount();
		}
		return summ;
	}

	public boolean checkMoney() {
		if (buyer.getMoney() >= calcFullPrice())
			return true;
		else
			return false;
	}

	public void endOfDeal() {
		if (checkMoney()) {
			buyer.setMoney(buyer.getMoney() - calcFullPrice());
			seller.setMoney(seller.getMoney() + calcFullPrice());
			System.out.println("Оплата прошла успешно.");
		} else
			System.out.println("Недостаточно средств.");
	}

}
