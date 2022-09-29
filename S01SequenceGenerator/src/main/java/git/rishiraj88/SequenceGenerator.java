package git.rishiraj88;

public class SequenceGenerator {

	private String prefix;
	private String suffix;
	private int initialValue;
	
	public SequenceGenerator() {}
	
	public SequenceGenerator(String prefix, int initialValue, String suffix) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initialValue = initialValue;
	}
	public SequenceGenerator(String prefix, String suffix, int initialValue) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initialValue = initialValue;
	}

	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}

	
	public String getSequence () {
		return prefix + initialValue++ + suffix;
	}
}
