package com.algoexpert.extras;

import java.util.Collection;

public class ImmutableCollectionImpl<E>  {
	private final Collection<E> immutableCollection;

	public ImmutableCollectionImpl(Collection<E> collection) {
		this.immutableCollection = collection;
	}

	public void add(E e) throws Exception {
		this.immutableCollection.add(e);
	}

	public void remove(E e) throws Exception {
		this.immutableCollection.remove(e);
	}

	public int size() {
		return immutableCollection.size();
	}
}
