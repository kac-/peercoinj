package org.bitcoinj.core;

public class CheckpointMessage extends Message {

	private static final long serialVersionUID = -5024961508993551096L;

	public CheckpointMessage(NetworkParameters params, byte[] payload, int offset)
			throws ProtocolException {
		super(params, payload, offset);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void parse() throws ProtocolException {
		length = payload.length;
	}

	@Override
	protected void parseLite() throws ProtocolException {
		// TODO Auto-generated method stub
	}
}
