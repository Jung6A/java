package dao;

import java.sql.SQLException;
import java.util.HashMap;
import dto.Coffee;

public class CoffeeDAO extends ParentDAO {
	
	public HashMap<Integer,Coffee> findAll() {
		HashMap<Integer,Coffee> data=new HashMap<>();
										   //desc: 내림차순  asc: 오름차순
		String sql="select * from coffee"; //coffee order by price desc;
		
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery(); //select: executeQuery   insert, update, delete: executeUpdate
			while(rs.next()) {
				//rs.get데이터타입("컬럼명");
				data.put(rs.getInt("coffee_id"),
						new Coffee(rs.getString("item_name"),rs.getInt("price"),rs.getBoolean("decaffein"))
						);
			}
		}catch(SQLException e) {
			System.out.println("coffee 테이블 조회 실패");
		}
		return data;
	}
	
}
