package Java_Assignment7;

interface Order
{
	void result(int price,String status);
}
public class PrintOrders 
{
	public static void main(String[] args)
	{
		Order MyOrder=(price,status)->{
			if(price>10000) {
				if(status=="ACCEPTED" || status=="COMPLETED")
				{
					System.out.println("----------------");
					System.out.println("Order Printed");
					System.out.println("----------------");
				}
			}
			else
			{
				System.out.println("----------------");
				System.out.println("Order is not printed");
				System.out.println("----------------");
			}
		};
		MyOrder.result(5000, "COMPLETED");
		MyOrder.result(5000000, "COMPLETED");
		MyOrder.result(50, "ACCEPTED");
		MyOrder.result(150000, "ACCEPTED");

	}

}