package boardgame;

public class Position {
	private Integer row;
	private int column;

	public Position(Integer row, int column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return row +", " + column;
	}
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
}
