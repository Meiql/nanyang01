package org.springrain.nybusiness.constants;

/**
 * 
 * 
 * 
 *
 */
public class SysStateEnum {

	// 通用状态状态
	public enum stateEnum {

		是("是", "1"), 否("否", "0");

		// 成员变量
		private String name;
		private String value;

		// 构造方法
		private stateEnum(String name, String value) {
			this.name = name;
			this.value = value;
		}

		// 普通方法
		public static String getName(String value) {
			for (stateEnum c : stateEnum.values()) {
				if (c.getValue().equals(value)) {
					return c.name;
				}
			}
			return null;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}


	public enum userActiveEnum {
		在职("在职", 1), 离职("离职", 0);
		private String name;
		private int value;

		private userActiveEnum(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}
	public enum userTypeEnum {
		系统账号("系统账号", 0), 员工("员工", 1);
		private String name;
		private int value;

		private userTypeEnum(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}


	public enum chuShiRoleEnum {
		初始角色("初始角色", "7740ec7a595e46b796538c3dfc8e1343");
		private String name;
		private String value;

		private chuShiRoleEnum(String name, String value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
	public enum adminIdEnum {
		admin("admin", "u_10001");
		private String name;
		private String value;

		private adminIdEnum(String name, String value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}


}
