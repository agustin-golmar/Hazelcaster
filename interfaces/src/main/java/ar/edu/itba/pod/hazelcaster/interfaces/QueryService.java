package ar.edu.itba.pod.hazelcaster.interfaces;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;

import ar.edu.itba.pod.hazelcaster.abstractions.Airport;
import ar.edu.itba.pod.hazelcaster.abstractions.Movement;
import ar.edu.itba.pod.hazelcaster.abstractions.outputObjects.MoveCountOutput;
import ar.edu.itba.pod.hazelcaster.abstractions.outputObjects.SameMovesPairOutput;

/**
	* <p>Las 6 queries requeridas por la cátedra.</p>
	*/

public interface QueryService {

	// NOTA: Se deben corregir los tipos de retorno.

	public List<MoveCountOutput> getAirportsMovements() throws InterruptedException, ExecutionException;
	
	public List<SameMovesPairOutput> getAirportsPairsWithSameMovements(List<Movement> movements,
			List<Airport> airports) throws InterruptedException, ExecutionException;
	
	public void getMovementsBetweenAirports();

	public void getAirportsWithMostLandings(final String oaci, final int airports);
	public void getAirportsWithMostInternationalLandings(final int airports);
	public void getProvincesPairsWithMovements(final int minMovements);
}
