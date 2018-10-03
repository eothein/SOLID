package d

/**
 * Manager class. Manages only 1 worker for simplicity reasons.
 *
 * @param worker The worker the manager manages
 */
class Manager(var worker: IWorker) {

    /**
     * Manages its worker
     */
    fun manage() {
        worker.work()
    }
}