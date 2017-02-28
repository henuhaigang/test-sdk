package com.gaogang.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

public class CharacterTest {

	public static void main(String[] args) {
		//System.out.println(new String(new char[] { (char) 3 }));
		String str = new String(new char[] { (char) 3 });
		//System.out.println(JSON.toJSONString(str)); // 输出结果："\u0003"
		//System.out.println(Md5Encoder.encodePassword("1"));;
		//System.out.println(UID.next());
		System.out.println(new Date().getTime());
		Random r=new Random();
		System.out.println(r.nextInt()*10);;
		/*for (int i = 0; i < 10; i++) {
			System.out.println("---->" + generateShortUuid());
			
			 * System.out.println(UUID.randomUUID().toString());
			 * System.out.println("---->"+generateShortUuid());
			 * System.out.println(UUIDUtil.genShortId());
			 * System.out.println(UUIDUtil.genId32());
			 
			
			 * long nowDate = new Date().getTime();
			 * System.out.println(Integer.toOctalString((int)nowDate));
			 
		}*/
		
		
		List<String> list=new ArrayList<String>();
		list.add("oneTime");
		list.add("usage");
		list.add("package");
		
		 List<Duartion> duartion_list=new ArrayList<Duartion>();
		 Duartion d=new Duartion();
		 d.setDescription("");
		 d.setHas_discount("false");
		 d.setKey("1");
		 d.setLabel("1个月");
		 Duartion d1=new Duartion();
		 d1.setDescription("");
		 d1.setHas_discount("false");
		 d1.setKey("2");
		 d1.setLabel("2个月");
		 duartion_list.add(d);
		 duartion_list.add(d1);
		 
		 Model model=new Model();
		 model.setDuartion_list(duartion_list);
		 model.setModel_list(list);
		 System.out.println(JSON.toJSONString(model));
		 

	}

	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };

	public static String generateShortUuid() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString();

	}
}
