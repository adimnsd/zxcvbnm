package zxcvbnm.Entity;
/**
 * 预定类型表实体类
 * @author 谢洪波
 *
 */
public class ReserveEntity {
	//预定类型id
	private int reserve_id;
	//预定类型
	private String reserveType;
	public int getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(int reserve_id) {
		this.reserve_id = reserve_id;
	}
	public String getReserveType() {
		return reserveType;
	}
	public void setReserveType(String reserveType) {
		this.reserveType = reserveType;
	}
}
