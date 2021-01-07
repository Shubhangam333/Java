package graphimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	private class Vertex{
		HashMap<String,Integer> nbrs= new HashMap<>();
	}
	HashMap<String,Vertex> vtces;
	public Graph() {
		vtces=new HashMap<>();
	}
	public int numVertex() {
		return this.vtces.size();
	}
	public boolean containsVertex(String vname) {
		return this.vtces.containsKey(vname);
	}
	public void addVertex(String vname) {
		Vertex vtx= new Vertex();
		vtces.put(vname,vtx);
	}
	public void removeVertex(String vname) {
		Vertex vtx=vtces.get(vname);
		ArrayList<String> keys= new ArrayList<>(vtx.nbrs.keySet());
		for(String key:keys) {
			Vertex nbrVtx = vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		vtces.remove(vname);
	}
	public int numEdges() {
		int count=0;
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		for(String key:keys) {
			Vertex vtx=vtces.get(key);
			count+=vtx.nbrs.size();
		}
		return count/2;
	}
	public boolean containsEdge(String vname1,String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}
	public void addEdge(String vname1,String vname2,int cost) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}   
	public void removeEdge(String vname1,String vname2) {
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1==null || vtx2==null ||!vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}
	public void display() {
		System.out.println("---------------------------------------");
		ArrayList<String> keys = new ArrayList<>(vtces.keySet());
		for(String key:keys) {
			Vertex vtx = vtces.get(key);
			System.out.println(key+":"+vtx.nbrs);
		}
		System.out.println("---------------------------------------");
	}
	public boolean hasPath(String vname1,String vname2,HashMap<String,Boolean>processed) {
		processed.put(vname1,true);
		
		if(containsEdge(vname1,vname2)) {
			return true;
		}
		Vertex vtx = vtces.get(vname1);
		
		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
		for(String nbr:nbrs) {
			if(!processed.containsKey(nbr) && hasPath(nbr,vname2,processed)) {
				return true;
			}
		}
		return false;
	}

	private class Pair{
		String vname;
		String osf;
	}
	
	public boolean bsf(String src,String dst) {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();
		Pair sp = new Pair();
		sp.vname=src;
		sp.osf=src;
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			if(containsEdge(rp.vname,dst)) {
				System.out.println(rp.osf+dst);
				return true;
			}
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					queue.addLast(np);
				}
			}
		}
		return false;
}
	public boolean dsf(String src,String dst) {
		HashMap<String,Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();
		Pair sp = new Pair();
		sp.vname=src;
		sp.osf=src;
		
		stack.addFirst(sp);
		
		while(!stack.isEmpty()) {
			Pair rp=stack.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			if(containsEdge(rp.vname,dst)) {
				System.out.println(rp.osf+dst);
				return true;
			}
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					stack.addFirst(np);
				}
			}
		}
		return false;
}
	public void bft() {
		HashMap<String,Boolean> processed = new HashMap<>();
		ArrayList<String> keys= new ArrayList<>(vtces.keySet());
		LinkedList<Pair> queue = new LinkedList<>();
		for(String key:keys) {
			
		if(processed.containsKey(key)) {
			continue;
		}
		Pair sp = new Pair();
		sp.vname=key;
		sp.osf=key;
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			
				System.out.println(rp.vname+ " via" +rp.osf);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					queue.addLast(np);
				}
			}
		}
		}
		
		
}
	public void dft() {
		HashMap<String,Boolean> processed = new HashMap<>();
		ArrayList<String> keys= new ArrayList<>(vtces.keySet());
		LinkedList<Pair> stack = new LinkedList<>();
		for(String key:keys) {
			
		if(processed.containsKey(key)) {
			continue;
		}
		Pair sp = new Pair();
		sp.vname=key;
		sp.osf=key;
		
		stack.addFirst(sp);
		
		while(!stack.isEmpty()) {
			Pair rp=stack.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			
				System.out.println(rp.vname+ " via" +rp.osf);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					stack.addFirst(np);
				}
			}
		}
		}
		
		
}
	public boolean isCyclic() {
		HashMap<String,Boolean> processed = new HashMap<>();
		ArrayList<String> keys= new ArrayList<>(vtces.keySet());
		LinkedList<Pair> queue = new LinkedList<>();
		for(String key:keys) {
			
		if(processed.containsKey(key)) {
			return true;
		}
		Pair sp = new Pair();
		sp.vname=key;
		sp.osf=key;
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			
			
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					queue.addLast(np);
				}
			}
		}
		}
		return false;
		
}
	public boolean isConnected() {
		int flag=0;
		HashMap<String,Boolean> processed = new HashMap<>();
		ArrayList<String> keys= new ArrayList<>(vtces.keySet());
		LinkedList<Pair> queue = new LinkedList<>();
		for(String key:keys) {
			
		if(processed.containsKey(key)) {
			continue;
		}
		flag++;
		Pair sp = new Pair();
		sp.vname=key;
		sp.osf=key;
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					queue.addLast(np);
				}
			}
		}
		}
		if(flag>=2) {
			return false;
		}else {
			return true;
		}
		
}
	public boolean isTree() {
		return !isCyclic() && isConnected();
	}
	public ArrayList<ArrayList<String>> getCC() {
		 ArrayList<ArrayList<String>> ans = new ArrayList<>();
		HashMap<String,Boolean> processed = new HashMap<>();
		ArrayList<String> keys= new ArrayList<>(vtces.keySet());
		LinkedList<Pair> queue = new LinkedList<>();
		for(String key:keys) {
			
		if(processed.containsKey(key)) {
			continue;
		}
		
		ArrayList<String> subans = new ArrayList<>();
		Pair sp = new Pair();
		sp.vname=key;
		sp.osf=key;
		
		queue.addLast(sp);
		
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			
			if(processed.containsKey(rp.vname)) {
				continue;
			}
			
			processed.put(rp.vname,true);
			
				subans.add(rp.vname);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String> nbrs= new ArrayList<>(rpvtx.nbrs.keySet());
			
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname=nbr;
					np.osf=rp.osf+nbr;
					
					queue.addLast(np);
				}
			}
		}
		//put in final ans
		ans.add(subans);
		}
		return ans;
		
}
	
	private class PrimsPair implements Comparable<PrimsPair>{
		String vname;
		String acqvname;
		int cost;
		
		@Override
		public int compareTo(PrimsPair o) {
			return o.cost - this.cost;
		}
	}
	public Graph prims() {
		Graph mst = new Graph();
		HashMap<String,PrimsPair> map = new HashMap();
		
		HeapGeneric<PrimsPair> heap = new HeapGeneric<>();
		//make a pair and put in heap and map
		for(String key:vtces.keySet()) {
			PrimsPair np = new PrimsPair();
			np.vname=key;
			np.acqvname=null;
			np.cost = Integer.MAX_VALUE;
			
			heap.add(np);
			map.put(key,np);
		}
		//till the heap is not empty keep on removing the pairs
		while(!heap.isEmpty()) {
			
			//remove a pair
			PrimsPair rp = heap.remove();
			map.remove(rp.vname);
			
			//add to mst
			if(rp.acqvname == null) {
				mst.addVertex(rp.vname);
			}else {
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname,rp.acqvname, rp.cost);
			}
			
			//nbrs
			for(String nbr:vtces.get(rp.vname).nbrs.keySet()) {
				//work for neighbors which are in heap
				if(map.containsKey(nbr)) {
					//get old cost and new cost
					int oc= map.get(nbr).cost;
					int nc= vtces.get(rp.vname).nbrs.get(nbr);
					//update the pair when old cost is more than new cost
					if(nc<oc) {
						PrimsPair gp = map.get(nbr);
						
						gp.acqvname=rp.acqvname;
						gp.cost=nc;
					}
				}
			}
		}
		
		return mst;
	}
}
