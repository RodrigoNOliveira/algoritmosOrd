import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {

        int tamanho =10000;

        Random gerador = new Random();
        int[] vetorDesordenado = new int[tamanho];

        for (int i = 0; i < vetorDesordenado.length; i++) {
            vetorDesordenado[i] = gerador.nextInt(tamanho);
        }

        System.out.println();
        long execIni = System.currentTimeMillis();
        System.out.println("Inicio algoritmo: " + execIni);


        // BUBBLESORT

        int[] vetorBub = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        System.out.println();
        long inicioBub = System.currentTimeMillis();
        System.out.println("Inicio BubbleSort: " + inicioBub);
        Simples.bubbleSort(vetorBub);
        long fimBub = System.currentTimeMillis();
        System.out.println("Fim BubbleSort: " + fimBub);
        long tempoBub = fimBub - inicioBub;
        System.out.println("Tempo de execução do BubbleSort(segundos): " + tempoBub/1000d);

        // INSERTIONSORT

        int[] vetorIns = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        System.out.println();
        long inicioIns = System.currentTimeMillis();
        System.out.println("Inicio InsertionSort: " + inicioIns);
        Simples.insertionSort(vetorIns);
        long fimIns = System.currentTimeMillis();
        System.out.println("Fim InsertionSort: " + fimIns);
        long tempoIns = fimIns - inicioIns;
        System.out.println("Tempo de execução do InsertionSort(segundos): " + tempoIns/1000d);

        // SELECTIONSORT

        int[] vetorSel = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        System.out.println();
        long inicioSel = System.currentTimeMillis();
        System.out.println("Inicio SelectionSort: " + inicioSel);
        Simples.selectionSort(vetorSel);
        long fimSel = System.currentTimeMillis();
        System.out.println("Fim SelectionSort: " + fimSel);
        long tempoSel = fimSel - inicioSel;
        System.out.println("Tempo de execução do SelectionSort(segundos): " + tempoSel/1000d);

        // QUICKSORT

        int[] vetorQui = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        System.out.println();
        long inicioQui = System.currentTimeMillis();
        System.out.println("Inicio quicksort: " + inicioQui);
        Sofisticado.quicksort(vetorQui);
        long fimQui = System.currentTimeMillis();
        System.out.println("Fim quicksort: " + fimQui);
        long tempoQui = fimQui - inicioQui;
        System.out.println("Tempo de execução do QuickSort(segundos): " + tempoQui/1000d);

        // MERGESORT

        int[] vetorMer = Arrays.stream(vetorDesordenado).toArray();
        System.out.println();
        System.out.println();
        long inicioMer = System.currentTimeMillis();
        System.out.println("Inicio MERGESORT: " + inicioMer);
        Sofisticado.mergesort(vetorMer);
        long fimMer = System.currentTimeMillis();
        System.out.println("Fim MERGESORT: " + fimMer);
        long tempoMer = fimMer - inicioMer;
        System.out.println("Tempo de execução do MergeSort(segundos): " + tempoMer/1000d);

        System.out.println();
        System.out.println();
        long execFim = System.currentTimeMillis();
        System.out.println("Fim total: " + execFim);
        long tempTotal = execFim - execIni;
        System.out.println();
        System.out.println("Tempo de execução do algoritmo: " + tempTotal);
    }
}
