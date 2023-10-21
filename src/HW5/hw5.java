package HW5;

public class hw5 {
	 private String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    private String codeCharArray = "";

	    public String genAuthCode() {
	        for (int i = 0; i < 8; i++) {
	            int getIndex = (int) (Math.random() * pool.length());
	            codeCharArray += Character.toString(pool.charAt(getIndex));
	        }
	        return codeCharArray;
	    }

	    public static void main(String[] args) {
	    	hw5 authCode = new hw5();
	        String code;

	        code = authCode.genAuthCode();
	        System.out.println("本次隨機產生驗證碼為：" + code);
	    }
}
